--action for categories table
INSERT INTO `categories` (`id`, `description`, `name`) VALUES (NULL, 'Cute animals', 'Adorable');
INSERT INTO `categories` (`id`, `description`, `name`) VALUES (NULL, 'Majestic landscapes', 'Breathtaking');
INSERT INTO `categories` (`id`, `description`, `name`) VALUES (NULL, 'Delicious cuisine', 'Mouthwatering');
INSERT INTO `categories` (`id`, `description`, `name`) VALUES (NULL, 'Extreme sports', 'Thrilling');
INSERT INTO `categories` (`id`, `description`, `name`) VALUES (NULL, 'Modern architecture', 'Striking');
INSERT INTO `categories` (`id`, `description`, `name`) VALUES (NULL, 'Abstract art', 'Expressive');
INSERT INTO `categories` (`id`, `description`, `name`) VALUES (NULL, 'Romantic moments', 'Intimate');
INSERT INTO `categories` (`id`, `description`, `name`) VALUES (NULL, 'Exciting board games', 'Competitive');
INSERT INTO `categories` (`id`, `description`, `name`) VALUES (NULL, 'Powerful automobiles', 'Fast');
INSERT INTO `categories` (`id`, `description`, `name`) VALUES (NULL, 'Elegant attire', 'Sophisticated');

--action for photo table
INSERT INTO `photos` (`id`, `title`, `description`, `url`, `posted`) VALUES (NULL, 'Serenità al tramonto', 'Spiaggia dorata, mare calmo, sole arancione che si abbassa', 'https://previews.123rf.com/images/glebstock/glebstock1701/glebstock170100028/70415741-serenit%C3%A0-e-praticare-lo-yoga-al-tramonto-la-meditazione.jpg', TRUE);
INSERT INTO `photos` (`id`, `title`, `description`, `url`, `posted`) VALUES (NULL, 'Energia urbana', 'Grattacieli imponenti, traffico frenetico, luci notturne scintillanti', 'https://anteritalia.org/wp-content/uploads/2019/11/iStock-993560630.jpg', TRUE);
INSERT INTO `photos` (`id`, `title`, `description`, `url`, `posted`) VALUES (NULL, 'Momenti familiari', 'Cascata rugente, foresta rigogliosa, arcobaleno sublime', 'https://www.provincia.tn.it/var/opencitypat/storage/images/media/images/parco-nazionale-dello-stelvio-foto-di-camilla-melzani-12/1487758-1-ita-IT/Parco-Nazionale-dello-Stelvio-Foto-di-Camilla-Melzani-1_reference.jpg', TRUE);
INSERT INTO `photos` (`id`, `title`, `description`, `url`, `posted`) VALUES (NULL, 'Momenti familiari', 'Tavolo imbandito, sorrisi contagiosi, abbracci affettuosi', 'https://img.freepik.com/free-vector/hand-drawn-family-moments-illustration_23-2150254012.jpg?w=1380&t=st=1688656439~exp=1688657039~hmac=7053970503c689406c0d0d01b8f9c9b9e04200796e2332ee0a55e6ef96a900c1', TRUE);
INSERT INTO `photos` (`id`, `title`, `description`, `url`, `posted`) VALUES (NULL, 'Avventura selvaggia', 'Cime montuose, sentieri tortuosi, animali selvatici curiosi', 'https://img.freepik.com/free-photo/close-up-young-backpacker-walking-through-forest-happy-with-nature_1150-4754.jpg?t=st=1688656585~exp=1688657185~hmac=8a62bc439036b33bc2d410e9e10e03b55a4e93675c9c4b81ca3c013f2edfbfbc', TRUE);
INSERT INTO `photos` (`id`, `title`, `description`, `url`, `posted`) VALUES (NULL, 'Riflessi di un autunno', 'Foglie dorate, lago tranquillo, cielo azzurro riflesso', 'https://img.freepik.com/free-photo/closeup-shot-lake-muskoka-ontario-canada_181624-40507.jpg?w=1380&t=st=1688656720~exp=1688657320~hmac=403bf38a68280c965f9a5a89fc58a817e94b40917de554dbf7489dc275e910bd', TRUE);
INSERT INTO `photos` (`id`, `title`, `description`, `url`, `posted`) VALUES (NULL, 'Vita in città', 'Mercato vivace, artisti di strada, grida di gioia', 'https://img.freepik.com/free-photo/girl-blue-hat-grey-sweater-stands-street-with-skyscrapers_8353-1359.jpg?t=st=1688656770~exp=1688657370~hmac=0e46447dafd9b3ee9a674ec7d882229a21583fd6cbbddb3e381d7a43ee856db4', TRUE);
INSERT INTO `photos` (`id`, `title`, `description`, `url`, `posted`) VALUES (NULL, 'Paesaggio incantato', 'Neve scintillante, abeti imponenti, silenzio pacifico', 'https://img.freepik.com/free-photo/fantastic-wonderland-forest-landscape-with-mushrooms-flowers-ai-generative_157027-1737.jpg?w=1380&t=st=1688656864~exp=1688657464~hmac=4b796586e2eb4b7f35d65b9cd8dbf475d7ec1f3318d2302cd211afb4f26f906c', TRUE);
INSERT INTO `photos` (`id`, `title`, `description`, `url`, `posted`) VALUES (NULL, 'Espressioni uniche', 'Volto rugoso, occhi penetranti, sorriso saggio', 'https://img.freepik.com/free-photo/close-up-joyful-little-ginger-boy-with-freckles-jumping-having-fun_176420-15539.jpg?t=st=1688656954~exp=1688657554~hmac=f5bdcfe0cdb445f3359817ef9de2d809d94ec5cdd311d01bef87a3ba354fba14', TRUE);
INSERT INTO `photos` (`id`, `title`, `description`, `url`, `posted`) VALUES (NULL, 'Magia delle onde', 'Spiaggia deserta, onde schiumose, brezza salata', 'https://img.freepik.com/free-photo/big-waves-stormy-ocean-with-sun-rays-pouring-through-water-sunrise-sunset-clouds-background_90220-1129.jpg?w=1380&t=st=1688657078~exp=1688657678~hmac=e3e850d04b6a68fb22f8f012fd87e57786f77a91bb435a8e3b89251fd0115fd9', TRUE);

-- INSERT INTO `photos` (`id`, `title`, `description`, `url`, `isPost`) VALUES (NULL, '', '', '', TRUE);


INSERT INTO `category_photo` (`category_id`, `photo_id`) VALUES ('1', '1'), ('2', '1'), ('3', '1'), ('4', '1'), ('5', '1'), ('6', '1');
INSERT INTO `category_photo` (`category_id`, `photo_id`) VALUES ('1', '2'), ('2', '2'), ('3', '2'), ('4', '2'), ('5', '2'), ('6', '2');
INSERT INTO `category_photo` (`category_id`, `photo_id`) VALUES ('1', '3'), ('2', '3'), ('3', '3'), ('4', '3'), ('5', '3'), ('6', '3');
INSERT INTO `category_photo` (`category_id`, `photo_id`) VALUES ('1', '4'), ('2', '4'), ('3', '4'), ('4', '4'), ('5', '4'), ('6', '4');
INSERT INTO `category_photo` (`category_id`, `photo_id`) VALUES ('1', '5'), ('2', '5'), ('3', '5'), ('4', '5'), ('5', '5'), ('6', '5');
INSERT INTO `category_photo` (`category_id`, `photo_id`) VALUES ('1', '6'), ('2', '6'), ('3', '6'), ('4', '6'), ('5', '6'), ('6', '6');
INSERT INTO `category_photo` (`category_id`, `photo_id`) VALUES ('1', '7'), ('2', '7'), ('3', '7'), ('4', '7'), ('5', '7'), ('6', '7');
INSERT INTO `category_photo` (`category_id`, `photo_id`) VALUES ('1', '8'), ('2', '8'), ('3', '8'), ('4', '8'), ('5', '8'), ('6', '8');
INSERT INTO `category_photo` (`category_id`, `photo_id`) VALUES ('1', '9'), ('2', '9'), ('3', '9'), ('4', '9'), ('5', '9'), ('6', '9');
INSERT INTO `category_photo` (`category_id`, `photo_id`) VALUES ('1', '10'), ('2', '10'), ('3', '10'), ('4', '10'), ('5', '10'), ('6', '10');

