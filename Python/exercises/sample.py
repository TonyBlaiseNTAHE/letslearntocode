tree_height = input("How tall is the tree: ")
tree_height = int(tree_height)
spaces = tree_height - 1
hashes = 1
stump_spaces = tree_height - 1

while tree_height != 0:
    for i in range(spaces):
        print(' ', end="")
    for i in range(hashes):
        print('#', end="")
    print()  # Add a newline to move to the next line
    spaces -= 1
    hashes += 2
    tree_height -= 1

# Print the tree stump
for i in range(stump_spaces):
    print(' ', end="")
print("#")