
def insertion_sort(l):
    for i in range(len(l)):
        j = i-1
        key = l[i]
        
        while j>=0 and l[j]>key:
            l[j+1] = l[j]
            j -= 1

        l[j+1] = key


l = [12, 11, 13, 5, 6]
insertion_sort(l)
print(l)


