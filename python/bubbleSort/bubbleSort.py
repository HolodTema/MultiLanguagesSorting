

def bubble_sort(l):
    for i in range(len(l)):
        for j in range(1, len(l)):
            if l[j-1] > l[j]:
                l[j-1], l[j] = l[j], l[j-1]

l = [12, 11, 13, 5, 6]
bubble_sort(l)
print(l)
