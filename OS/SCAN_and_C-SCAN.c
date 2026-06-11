#include <stdio.h>
#include <stdlib.h>

#define MAX_REQUESTS 100

static int compare_int(const void *a, const void *b)
{
    return (*(const int *)a - *(const int *)b);
}

static void print_result(const char *name, int order[], int count, int movement)
{
    int i;

    printf("\n%s Disk Scheduling\n", name);
    printf("Seek Sequence: ");
    for (i = 0; i < count; i++) {
        printf("%d", order[i]);
        if (i + 1 < count) {
            printf(" -> ");
        }
    }
    printf("\nTotal Head Movement: %d cylinders\n", movement);
}

static int add_move(int order[], int *count, int *current, int next)
{
    int movement = abs(next - *current);
    order[(*count)++] = next;
    *current = next;
    return movement;
}

static void scan(int requests[], int n, int head, int disk_size, int move_right)
{
    int sorted[MAX_REQUESTS];
    int order[MAX_REQUESTS + 2];
    int count = 0;
    int movement = 0;
    int current = head;
    int split = 0;
    int i;

    for (i = 0; i < n; i++) {
        sorted[i] = requests[i];
    }
    qsort(sorted, n, sizeof(sorted[0]), compare_int);

    while (split < n && sorted[split] < head) {
        split++;
    }

    if (move_right) {
        for (i = split; i < n; i++) {
            movement += add_move(order, &count, &current, sorted[i]);
        }

        if (split > 0 && current != disk_size - 1) {
            movement += add_move(order, &count, &current, disk_size - 1);
        }

        for (i = split - 1; i >= 0; i--) {
            movement += add_move(order, &count, &current, sorted[i]);
        }
    } else {
        for (i = split - 1; i >= 0; i--) {
            movement += add_move(order, &count, &current, sorted[i]);
        }

        if (split < n && current != 0) {
            movement += add_move(order, &count, &current, 0);
        }

        for (i = split; i < n; i++) {
            movement += add_move(order, &count, &current, sorted[i]);
        }
    }

    print_result("SCAN", order, count, movement);
}

static void cscan(int requests[], int n, int head, int disk_size, int move_right)
{
    int sorted[MAX_REQUESTS];
    int order[MAX_REQUESTS + 3];
    int count = 0;
    int movement = 0;
    int current = head;
    int split = 0;
    int i;

    for (i = 0; i < n; i++) {
        sorted[i] = requests[i];
    }
    qsort(sorted, n, sizeof(sorted[0]), compare_int);

    while (split < n && sorted[split] < head) {
        split++;
    }

    if (move_right) {
        for (i = split; i < n; i++) {
            movement += add_move(order, &count, &current, sorted[i]);
        }

        if (split > 0) {
            if (current != disk_size - 1) {
                movement += add_move(order, &count, &current, disk_size - 1);
            }
            movement += add_move(order, &count, &current, 0);

            for (i = 0; i < split; i++) {
                movement += add_move(order, &count, &current, sorted[i]);
            }
        }
    } else {
        for (i = split - 1; i >= 0; i--) {
            movement += add_move(order, &count, &current, sorted[i]);
        }

        if (split < n) {
            if (current != 0) {
                movement += add_move(order, &count, &current, 0);
            }
            movement += add_move(order, &count, &current, disk_size - 1);

            for (i = n - 1; i >= split; i--) {
                movement += add_move(order, &count, &current, sorted[i]);
            }
        }
    }

    print_result("C-SCAN", order, count, movement);
}

int main(void)
{
    int requests[MAX_REQUESTS];
    int n;
    int head;
    int disk_size;
    int direction;
    int i;

    printf("Enter number of disk requests: ");
    if (scanf("%d", &n) != 1 || n <= 0 || n > MAX_REQUESTS) {
        printf("Invalid number of requests. Enter a value from 1 to %d.\n", MAX_REQUESTS);
        return 1;
    }

    printf("Enter disk size (number of cylinders): ");
    if (scanf("%d", &disk_size) != 1 || disk_size <= 0) {
        printf("Invalid disk size.\n");
        return 1;
    }

    printf("Enter disk requests:\n");
    for (i = 0; i < n; i++) {
        if (scanf("%d", &requests[i]) != 1 ||
            requests[i] < 0 ||
            requests[i] >= disk_size) {
            printf("Invalid request. Requests must be between 0 and %d.\n", disk_size - 1);
            return 1;
        }
    }

    printf("Enter initial head position: ");
    if (scanf("%d", &head) != 1 || head < 0 || head >= disk_size) {
        printf("Invalid head position. It must be between 0 and %d.\n", disk_size - 1);
        return 1;
    }

    printf("Enter direction (1 for right, 0 for left): ");
    if (scanf("%d", &direction) != 1 || (direction != 0 && direction != 1)) {
        printf("Invalid direction.\n");
        return 1;
    }

    scan(requests, n, head, disk_size, direction == 1);
    cscan(requests, n, head, disk_size, direction == 1);

    return 0;
}
