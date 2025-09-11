from collections import deque

def is_one_char_difference(word1, word2):
    difference_count = 0

    for char1, char2 in zip(word1, word2):
        if char1 != char2:
            difference_count += 1
        if difference_count > 1:
            return False

    return difference_count == 1

def doublets(start, end, elements):
    word_set = set(elements)
    if end not in word_set:
        return []  

    queue = deque([(start, [start])])
    visited = set()

    while queue:
        current_word, path = queue.popleft()
        if current_word == end:
            return path
       
        for word in word_set:                       
            if word not in visited and is_one_char_difference(current_word, word):
                visited.add(word)
                queue.append((word, path + [word]))

    return []

elements = ["cold", "cord", "card", "ward", "warm", "core", "worm", "bold", "told"]
start = "card"
end = "warm"

result = doublets(start, end, elements)
print("Shortest Path:", result)

