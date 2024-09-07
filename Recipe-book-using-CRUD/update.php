<?php
include 'db.php';

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $action = $_POST['action'] ?? '';

    if ($action === 'update') {
        $id = $_POST['id'];
        $name = $_POST['name'];
        $cooking_time = $_POST['cooking-time'];
        $description = $_POST['description'];
        $ingredients = $_POST['ingredients'];
        $direction = $_POST['direction'];

        $sql = "UPDATE recipe SET name = ?, cooking_time = ?, description = ?, ingredients = ?, direction = ? WHERE id = ?";
        $stmt = $conn->prepare($sql);
        $stmt->bind_param("sssssi", $name, $cooking_time, $description, $ingredients, $direction, $id);
        
        if ($stmt->execute()) {
            header("Location: landing.php");
            exit();
        } else {
            echo "Error updating recipe: " . $conn->error;
        }
    } elseif ($action === 'cancel') {
        header("Location: landing.php");
        exit();
    }
}
?>
