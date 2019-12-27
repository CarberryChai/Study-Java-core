package interfaceDemo;

public class Computer {
  public void open() {
    System.out.println("电脑打开");
  }

  public void close() {
    System.out.println("电脑打开");
  }

  public void useUsb(USB usb) {
    usb.open();
    if (usb instanceof Mouse) {
      Mouse mouse = (Mouse) usb;
      mouse.click();
    } else if (usb instanceof Keyboard) {
      Keyboard keyboard = (Keyboard) usb;
      keyboard.type();
    }
    usb.close();
  }
}
