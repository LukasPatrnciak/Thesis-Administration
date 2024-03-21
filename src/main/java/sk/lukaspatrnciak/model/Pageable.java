package sk.lukaspatrnciak.model;

/**
 * Rozhranie pre informácie o stránke. Trieda je použitá pre dopyt o stránku vyhľadávanej entity a zároveň
 * pre uchovanie informácií o vrátenej stránke v triede implementujúcu rozhranie {@link Page}.
 * Implementácia musí obsahovať prázdny konštruktor.
 */
public interface PageableInterface {

    Pageable of(int page, int size);

    Pageable first();

    Pageable previous();

    Pageable next();

    Integer getNumber();

    Integer getSize();

    Long getTotalElements();

    void setTotalElements(Long totalElements);

    Integer getTotalPages();

}
