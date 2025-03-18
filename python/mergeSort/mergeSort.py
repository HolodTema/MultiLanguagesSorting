
def merge(l1, l2):
    result = [0 for i in range(len(l1)+len(l2))]
    index1 = 0
    index2 = 0
    index = 0
    while index1 < len(l1) and index2 < len(l2):
        if l1[index1] < l2[index2]:
            result[index] = l1[index1]
            index += 1
            index1 += 1
        else:
            result[index] = l2[index2]
            index += 1
            index2 += 1

    while index1 < len(l1):
        result[index] = l1[index1]
        index += 1
        index1 += 1

    while index2 < len(l2):
        result[index] = l2[index2]
        index += 1
        index2 += 1

    return result



def merge_sort(l):
    if len(l) <= 1:
        return l

    m = len(l) // 2
    left = l[:m]
    right = l[m:]
   
    return merge(merge_sort(left), merge_sort(right))


l = [12, 11, 13, 5, 6, 100, 8, 10, 5, 47, 30]
result = merge_sort(l)
print(result)
