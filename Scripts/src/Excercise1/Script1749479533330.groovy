//**Create a list of numbers: [10, 20, 30, 40, 50]
def numbers = [10, 20, 30, 40, 50]
//Add 60 to the list.
numbers << 60
println "\u001B[33m List after add 60: $numbers \u001B[0m"
//Remove the number 30 from the list.
numbers -= 30
println "\u001B[33m List after remove 30: $numbers \u001B[0m"
//Print the first and last element.

println "\u001B[33m First element: ${numbers[0]} \u001B[0m"
println "\u001B[33m Last element: ${numbers[-1]} \u001B[0m"