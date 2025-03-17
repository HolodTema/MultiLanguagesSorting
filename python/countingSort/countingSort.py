
def counting_sort(l):
    maxElement = float('-inf')
    for e in l:
        if e > maxElement: 
            maxElement = e

    countingList = [0 for i in range(maxElement+1)]
    for e in l:
        countingList[e] += 1

    for i in range(1, len(countingList)):
        countingList[i] += countingList[i-1]

    result = [0 for i in range(len(l))]
    for i in range(len(l)-1, -1, -1):
        result[countingList[l[i]]-1] = l[i]
    return result


l = [12, 11, 13, 5, 6]
result = counting_sort(l)
print(result)
