<?php
include 'db.php';

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $name = $_POST['name'];
    $cooking_time = $_POST['cooking-time'];
    $description = $_POST['description'];
    $ingredients = $_POST['ingredients'];
    $direction = $_POST['direction'];

    $sql = "INSERT INTO recipe (name, cooking_time, description, ingredients, direction) VALUES (?, ?, ?, ?, ?)";
    $stmt = $conn->prepare($sql);
    $stmt->bind_param("sssss", $name, $cooking_time, $description, $ingredients, $direction);
    
    if ($stmt->execute()) {
        header("Location: landing.php");
        exit();
    } else {
        echo "Error creating recipe: " . $conn->error;
    }
}
?>
