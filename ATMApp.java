public void showSplashScreen() {
    // Dynamically generate ATM logo instead of loading from file
    BufferedImage logo = generateATMLogo();
    JLabel splashLabel = new JLabel(new ImageIcon(logo));
    // Other splash screen code...
}

private BufferedImage generateATMLogo() {
    // Implementation of logo generation
    BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
    Graphics2D g = image.createGraphics();
    g.setColor(Color.BLUE);
    g.fillRect(0, 0, 100, 100);
    g.setColor(Color.WHITE);
    g.drawString("ATM Logo", 10, 50);
    g.dispose();
    return image;
}