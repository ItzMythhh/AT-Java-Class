Mower mower = new Mower();
mower.setVerticalPos(1);
mower.setHorizontalPos(1);
mower.setDirection(1); // facing right

while (mower.getHorizontalPos() < yard.getWidth()) {
    Yard.clearScreen();

    mower.mowSpace(yard);
    yard.printLawn(mower);

    delay(500);

    mower.moveMower();
}
