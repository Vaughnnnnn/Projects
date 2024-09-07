<?php
    include 'db.php';

    $sql = "SELECT * FROM recipe";
    $result = $conn->query($sql);
    $selectedRecipe = null;
    $newRecipe = null;

    if (isset($_GET['recipe_id'])) {
        $recipe_id = $_GET['recipe_id'];
        $sql = "SELECT * FROM recipe WHERE id = ?";
        $stmt = $conn->prepare($sql);
        $stmt->bind_param("i", $recipe_id);
        $stmt->execute();
        $result_recipe = $stmt->get_result();
        $selectedRecipe = $result_recipe->fetch_assoc();
    }

    if (isset($_GET['update']) && $_GET['update'] == 'true' && $selectedRecipe) {
        $update_id = $_GET['update_id'];
        $sql = "SELECT * FROM recipe WHERE id = ?";
        $stmt = $conn->prepare($sql);
        $stmt->bind_param("i", $update_id);
        $stmt->execute();
        $result_update = $stmt->get_result();
        $update_recipe = $result_update->fetch_assoc(); 
    }

    if (isset($_GET['create']) && $_GET['create'] == true) {
        $newRecipe = true;
    }
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="landing.css">
    <title>Landing-Page</title>
</head>
<body>
    <header>
        <div class="box">
            <a href="landing.php" class="logo">
                DELICIOSO
            </a>
            <a href="?create=true" class="create">
                <button class="create-button">
                    Create Recipe
                </button>
            </a>
        </div>
    </header>

    <section>
        <div class="hero">
            <div class="content">
                <h1>
                    Home Cooking:    <br>
                    Where Love Meets <br>
                    Flavor
                </h1>
                <p>Create Memories One Dish at a Time</p>
                <a href="?create=true" class="create">
                    <button class="create-button">
                        Create Recipe
                    </button>
                </a>
            </div>
            <div class="image">
                <img src="hero-image.jpg" alt="food-image">
            </div>
        </div>
    </section>

    <div class="grid">
        <div class="recipe-list">
        <?php while ($row = $result->fetch_assoc()): ?>
                <div class="recipe-item">
                    <h2 class="name"><?php echo htmlspecialchars($row['name']); ?></h2>
                    <p class="time"><strong>Cooking Time:</strong> <?php echo htmlspecialchars($row['cooking_time']); ?></p>
                    <p class="des"><?php echo htmlspecialchars($row['description']); ?></p>
                    <a href="?recipe_id=<?php echo $row['id']; ?>" class="see-more">
                        <button type="button">See More</button>
                    </a>
                </div>
            <?php endwhile; ?>
        </div>
    </div> 

    <!-- view recipe -->
    <?php if ($selectedRecipe): ?>
        <div class="recipe-overlay">
            <div class="overlay-content">
                <div class="head">
                    <div class="upper">
                        <h1 class="name"><?php echo htmlspecialchars($selectedRecipe['name']); ?></h1>
                        <p><strong>Cooking Time: </strong><?php echo htmlspecialchars($selectedRecipe['cooking_time']); ?></p>
                    </div>
                    <div class="icons">
                        <a href="?recipe_id=<?php echo $selectedRecipe['id']; ?>&update=true" class="update">
                            <button>
                                <svg xmlns="http://www.w3.org/2000/svg" width="30" height="30" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round" class="lucide lucide-square-pen"><path d="M12 3H5a2 2 0 0 0-2 2v14a2 2 0 0 0 2 2h14a2 2 0 0 0 2-2v-7"/><path d="M18.375 2.625a1 1 0 0 1 3 3l-9.013 9.014a2 2 0 0 1-.853.505l-2.873.84a.5.5 0 0 1-.62-.62l.84-2.873a2 2 0 0 1 .506-.852z"/></svg>
                            </button>
                        </a>
                        <a href="delete.php?id=<?php echo $selectedRecipe['id']; ?>" class="delete-icon">
                            <button>
                                <svg xmlns="http://www.w3.org/2000/svg" width="30" height="30" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round" class="lucide lucide-trash-2"><path d="M3 6h18"/><path d="M19 6v14c0 1-1 2-2 2H7c-1 0-2-1-2-2V6"/><path d="M8 6V4c0-1 1-2 2-2h4c1 0 2 1 2 2v2"/><line x1="10" x2="10" y1="11" y2="17"/><line x1="14" x2="14" y1="11" y2="17"/></svg>
                            </button>
                        </a>
                    <div class="line"> | </div>
                    <a href="landing.php">
                        <button>
                            <svg xmlns="http://www.w3.org/2000/svg" width="30" height="30" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round" class="lucide lucide-circle-x"><circle cx="12" cy="12" r="10"/><path d="m15 9-6 6"/><path d="m9 9 6 6"/></svg>
                        </button>
                    </a> 
                    </div>
                </div>
                <div class="hero">
                    <p class="des"><?php echo htmlspecialchars($selectedRecipe['description']); ?></p>
                    <ul class="ing">
                        <li>
                            <?php
                                $ingredients = explode("\n", $selectedRecipe['ingredients']);
                                foreach ($ingredients as $index => $ingredient) {
                                    echo htmlspecialchars($ingredient);
                                    if ($index < count($ingredients) - 1) {
                                        echo '<br>';
                                    }
                                }
                            ?>
                        </li>
                    </ul>
                </div>
                <div class="content">
                    <p class="dir">
                        <?php
                            $ingredients = explode("\n", $selectedRecipe['direction']);
                            foreach ($ingredients as $index => $ingredient) {
                                echo htmlspecialchars($ingredient);
                                if ($index < count($ingredients) - 1) {
                                    echo '<br>';
                                }
                            }
                        ?>
                    </p>
                </div>
            </div>
        </div>
    <?php endif; ?>

    <!-- Update -->
    <?php if (isset($_GET['update']) && $_GET['update'] == 'true' && $selectedRecipe): ?>
        <div class="update-overlay">
            <div class="update-content">
                <div class="head">
                    <h1>Update Recipe</h1>
                </div>

                <div class="hero">
                    <form action="update.php" method="post">
                        <input type="hidden" name="id" value="<?php echo htmlspecialchars($selectedRecipe['id']); ?>">

                        <input class="name" placeholder="Recipe Name:" type="text" id="name" name="name" value="<?php echo htmlspecialchars($selectedRecipe['name']); ?>" required>

                        <input class="time" placeholder="Cooking Time:" type="text" id="cooking-time" name="cooking-time" value="<?php echo htmlspecialchars($selectedRecipe['cooking_time']); ?>" required>

                        <textarea class="des" placeholder="Description:" id="description" name="description" required><?php echo htmlspecialchars($selectedRecipe['description']); ?></textarea>

                        <textarea class="ing" placeholder="Ingredients:" id="ingredients" name="ingredients" required><?php echo htmlspecialchars($selectedRecipe['ingredients']); ?></textarea>

                        <textarea class="dir" placeholder="Direction:" id="direction" name="direction" required><?php echo htmlspecialchars($selectedRecipe['direction']); ?></textarea>
                        
                        <div class="button">
                            <button class="update" type="submit" name="action" value="update">Update</button>
                            <button class="cancel" type="submit" name="action" value="cancel">Cancel</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    <?php endif; ?>
    
    <!-- Create Recipe -->
    <?php if ($newRecipe): ?>
        <div class="create-overlay">
            <div class="create-content">
                <div class="head">
                    <h1>Create Recipe</h1>
                </div>

                <div class="hero">
                    <form action="create.php" method="post">
                        <input class="name" placeholder="Recipe Name:" type="text" id="name" name="name" required>
                        
                        <input class="time" placeholder="Cooking Time:" type="text" id="cooking-time" name="cooking-time" required>
                        
                        <textarea class="des" placeholder="Description:" id="description" name="description" required></textarea>
                        
                        <textarea class="ing" placeholder="Ingredients:" id="ingredients" name="ingredients" required></textarea>
                        
                        <textarea class="dir" placeholder="Direction:" id="direction" name="direction" required></textarea>
                        
                        <div class="button">
                            <button class="create-recipe" type="submit" name="action" value="create-recipe">Create</button>
                            <a href="landing.php" class="cancel">
                                <button class="cancel" type="button" name="action" value="cancel">Cancel</button>
                            </a>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    <?php endif; ?>

    <footer>
        <div class="container">
            <h1>DELICIOSO</h1>
            <p>© <?php echo date("Y"); ?> DELICIOSO. All rights reserved.</p>
        </div>
    </footer>
</body>
</html>