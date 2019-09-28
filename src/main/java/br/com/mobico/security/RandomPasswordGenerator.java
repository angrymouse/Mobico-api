package br.com.mobico.security;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public final class RandomPasswordGenerator {

    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";

    public String generate(int length) {
        // validação do argumento.
        if (length <= 0) {
            return "";
        }

        StringBuilder password = new StringBuilder(length);
        Random random = new Random(System.nanoTime());

        //Coleções das categorias
        List<String> charCategories = new ArrayList<>();
        charCategories.add(LOWER);
        charCategories.add(UPPER);
        charCategories.add(DIGITS);

        //Constrói a senha
        for (int i = 0; i < length; i++) {
            String charCategory = charCategories.get(random.nextInt(charCategories.size()));
            int position = random.nextInt(charCategory.length());
            password.append(charCategory.charAt(position));
        }
        return new String(password);
    }
}
