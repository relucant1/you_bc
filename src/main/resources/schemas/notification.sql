CREATE TABLE pending_notification (
  id INT PRIMARY KEY AUTO_INCREMENT,
  subject VARCHAR(100) UNIQUE,
  wechatId VARCHAR(100),
  username VARCHAR(50) CHARACTER SET utf8mb4,
  thumbnail_image_url TEXT,
  time_created DATETIME NOT NULL,

  FOREIGN KEY (subject) REFERENCES user(user_id) ON DELETE CASCADE
);