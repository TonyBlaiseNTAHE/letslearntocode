investment = eval(input("Enter the inverstment: "))
interest = eval(input("Enter the interst: "))
for i in range(1,11):
    investment += interest
print(f"for {i} years the earnings are {investment:.2f}")
