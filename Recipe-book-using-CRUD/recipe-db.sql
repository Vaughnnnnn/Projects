-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 13, 2024 at 11:48 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `recipe-db`
--

-- --------------------------------------------------------

--
-- Table structure for table `recipe`
--

CREATE TABLE `recipe` (
  `id` int(11) NOT NULL,
  `name` text NOT NULL,
  `description` text NOT NULL,
  `cooking_time` varchar(50) NOT NULL,
  `ingredients` text NOT NULL,
  `direction` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `recipe`
--

INSERT INTO `recipe` (`id`, `name`, `description`, `cooking_time`, `ingredients`, `direction`) VALUES
(8, 'Adobo', 'A savory Filipino stew made with chicken or pork marinated in vinegar, soy sauce, garlic, and spices, then simmered until tender.', '45 minutes', '1 kg chicken or pork (cut into chunks)\r\n1/2 cup soy sauce\r\n1/4 cup vinegar\r\n1 head garlic (minced)\r\n2 bay leaves\r\n1 tsp black peppercorns\r\n1 tbsp vegetable oil\r\n1 cup water\r\n1 tbsp brown sugar (optional)\r\nSalt and pepper to taste', 'In a bowl, combine the soy sauce, vinegar, garlic, bay leaves, and peppercorns. Marinate the meat for at least 30 minutes.\r\nHeat oil in a pan over medium heat. Add the marinated meat (reserve the marinade) and cook until browned.\r\nPour in the reserved marinade and water. Bring to a boil, then reduce heat to low and simmer for 30 minutes or until the meat is tender.\r\nIf desired, add brown sugar and adjust seasoning with salt and pepper.\r\nServe hot with steamed rice.'),
(9, 'Sinigang na Baboy', 'A sour pork soup flavored with tamarind, tomatoes, and various vegetables, creating a comforting and tangy dish.', '1 hour', '1 kg pork ribs or belly (cut into chunks)\r\n1 onion (sliced)\r\n2 tomatoes (quartered)\r\n1 packet tamarind soup base (or 1/2 cup tamarind paste)\r\n1 radish (sliced)\r\n1 eggplant (cut into chunks)\r\n1 cup string beans (cut into pieces)\r\n1-2 green chili peppers (optional)\r\n1 tbsp fish sauce\r\nSalt and pepper to taste\r\n1 bunch kangkong or spinach (optional)', 'In a large pot, boil the pork with onions and tomatoes until the meat is tender, about 30-40 minutes.\r\nAdd the tamarind soup base or tamarind paste and mix well.\r\nAdd the radish, eggplant, and string beans. Cook until vegetables are tender.\r\nSeason with fish sauce, salt, and pepper. Add green chili peppers if desired.\r\nStir in kangkong or spinach just before serving. Serve hot with rice.'),
(10, 'Pancit Canton', 'Stir-fried egg noodles with vegetables, meat, and a savory sauce, perfect for celebrations and gatherings.', '30 minutes', '200g pancit canton noodles\r\n1 tbsp vegetable oil\r\n1 onion (sliced)\r\n3 cloves garlic (minced)\r\n1 cup sliced chicken or pork\r\n1 cup sliced carrots\r\n1 cup sliced bell peppers\r\n1 cup shredded cabbage\r\n2 tbsp soy sauce\r\n1 tbsp oyster sauce\r\n1/2 cup chicken broth\r\nSalt and pepper to taste', 'Cook the pancit canton noodles according to package instructions. Drain and set aside.\r\nHeat oil in a large pan or wok over medium heat. Sauté onions and garlic until fragrant.\r\nAdd chicken or pork and cook until browned and cooked through.\r\nAdd carrots, bell peppers, and cabbage. Stir-fry until vegetables are tender-crisp.\r\nStir in soy sauce, oyster sauce, and chicken broth. Add the cooked noodles and toss to combine.\r\nSeason with salt and pepper. Cook for an additional 2-3 minutes. Serve hot.'),
(11, 'Lechon Kawali', 'Crispy deep-fried pork belly served with liver sauce or vinegar dipping sauce, known for its crunchy skin and tender meat.\r\n', '1 hour 30 minutes', '1 kg pork belly (cut into chunks)\r\n1 tbsp salt\r\n1 tsp pepper\r\n1 tbsp soy sauce\r\n2 cloves garlic (crushed)\r\n1 bay leaf\r\n1 tbsp vegetable oil\r\nOil for deep frying', 'In a pot, combine pork belly, salt, pepper, soy sauce, garlic, and bay leaf. Add enough water to cover the meat. Bring to a boil, then reduce heat and simmer until the meat is tender, about 1 hour.\r\nRemove pork from the pot and let it cool. Pat dry with paper towels.\r\nHeat oil in a deep fryer or large pot to 350°F (175°C). Carefully fry the pork belly in batches until the skin is crispy and golden brown.\r\nRemove from the oil and drain on paper towels.\r\nServe with liver sauce or vinegar dipping sauce.');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `recipe`
--
ALTER TABLE `recipe`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `recipe`
--
ALTER TABLE `recipe`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
