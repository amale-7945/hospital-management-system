data class Patient(val id: Int, val name: String, val age: Int, val disease: String)

fun main() {
    val patients = mutableListOf<Patient>()

    while (true) {
        println("\n--- Hospital Management System ---")
        println("1. Add Patient")
        println("2. View Patients")
        println("3. Exit")
        print("Enter choice: ")

        when (readLine()?.toIntOrNull()) {
            1 -> {
                print("Enter ID: ")
                val id = readLine()!!.toInt()

                print("Enter Name: ")
                val name = readLine()!!

                print("Enter Age: ")
                val age = readLine()!!.toInt()

                print("Enter Disease: ")
                val disease = readLine()!!

                patients.add(Patient(id, name, age, disease))
                println("Patient added successfully!")
            }

            2 -> {
                println("\nPatient List:")
                for (p in patients) {
                    println("ID: ${p.id}, Name: ${p.name}, Age: ${p.age}, Disease: ${p.disease}")
                }
            }

            3 -> {
                println("Exiting...")
                break
            }

            else -> println("Invalid choice!")
        }
    }
}