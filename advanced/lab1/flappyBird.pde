Game game;

void setup() {
  size(400, 719);
  game = new Game();
}

void draw() {
  background(game.getBackground());
  game.show();
  game.update();
}

void mouseClicked() {
  game.bird.flap();
}