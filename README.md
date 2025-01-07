### Shopping Assistant System

---

**Project Name:** Shopping Assistant System  
This project is a simple Shopping Assistant System. It allows users to search for products, compare prices, and get product details.

---

### **Files in the Project**

1. **User.java**: Represents the user who searches for products.  
2. **SearchService.java**: Handles the logic for searching products.  
3. **Product.java**: Represents a product with details like ID, name, and price.  
4. **ProductDB.java**: Simulates the database where product details are stored.  
5. **Main.java**: Runs the program to test the system.

---

### **How to Run**

1. **Install Java**  
   Download and install the Java Development Kit (JDK) from the official website.

2. **Set Up the Project**  
   - Create a folder named `ShoppingAssistant`.  
   - Inside this folder, create another folder called `src`.  
   - Save the provided Java files (`User.java`, `SearchService.java`, `Product.java`, `ProductDB.java`, `Main.java`) inside the `src` folder.  

3. **Open the Terminal**  
   - Go to the `src` folder using the terminal:  
     ```
     cd path_to_your_project/ShoppingAssistant/src
     ```

4. **Compile the Files**  
   - Run the following command to compile the Java files:  
     ```
     javac *.java
     ```

5. **Run the Program**  
   - After compiling, run the program using this command:  
     ```
     java Main
     ```

---

### **Principles Followed in the Design**

1. **Separation of Concerns**:  
   - Each class is responsible for a specific task (e.g., `User` for user actions, `SearchService` for searching).

2. **Single Responsibility Principle**:  
   - Every class focuses on only one purpose, making it easier to manage.

3. **Modularity**:  
   - The project is divided into small, manageable parts (modules).

4. **Scalability**:  
   - New features can be added without breaking the existing code.

5. **Reusability**:  
   - Classes like `Product` and `SearchService` can be reused for other features.

---

### **Example Output**

When you run the program, the output will look something like this:  

```
Products Found:
ID: 1, Name: Laptop, Price: 800.0
ID: 2, Name: Smartphone, Price: 500.0
ID: 3, Name: Headphones, Price: 50.0
```

---

### **Future Improvements**

- Add features like personalized recommendations.  
- Use a real database for storing product details.  
- Add user login and authentication.  

---

**End of Instructions**
