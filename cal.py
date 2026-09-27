# Simple Terminal Calculator

print("===== Calculator =====")
print("Operations: +  -  *  /")
print("Type 'q' to quit")

while True:
    operation = input("\nEnter operation (+, -, *, /): ")

    if operation.lower() == "q":
        print("Goodbye!")
        break

    if operation not in ["+", "-", "*", "/"]:
        print("Invalid operation!")
        continue

    try:
        num1 = float(input("Enter first number: "))
        num2 = float(input("Enter second number: "))

        if operation == "+":
            result = num1 + num2

        elif operation == "-":
            result = num1 - num2

        elif operation == "*":
            result = num1 * num2

        elif operation == "/":
            if num2 == 0:
                print("Cannot divide by zero!")
                continue
            result = num1 / num2

        print("Result:", result)

    except ValueError:
        print("Please enter valid numbers!")
