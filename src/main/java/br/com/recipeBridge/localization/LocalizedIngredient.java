package br.com.recipeBridge.localization;

import br.com.recipeBridge.measures.ConversionStatus;

public record LocalizedIngredient(
    int index,
    String original,
    String translated,
    String originalMeasure,
    String localizedMeasure,
    ConversionStatus conversionStatus,
    String warning
) {
}
