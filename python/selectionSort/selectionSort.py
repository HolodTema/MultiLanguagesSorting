
def selection_sort(l):
    for i in range(len(l)):
        minIndex = 0
        minKey = float('inf')
        for j in range(i, len(l)):
            if l[j] < minKey:
                minKey = l[j]
                minIndex = j

        l[i], l[minIndex] = l[minIndex], l[i]


l = [12, 11, 13, 5, 6]
selection_sort(l)
print(l)


