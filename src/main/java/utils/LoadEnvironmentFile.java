package utils;

import io.github.cdimascio.dotenv.Dotenv;

public class LoadEnvironmentFile {
    public static Dotenv dotenv = Dotenv.configure().load();
}
