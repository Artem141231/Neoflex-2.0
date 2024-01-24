package ru.neoflex.practice.model;
import jakarta.persistence.*;
@Entity
@Table
public class Calculation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer a;
    private Integer b;
    private Integer result;
    public Calculation() {
    }
    public Calculation(Integer a, Integer b, Integer result) {
        this.a = a;
        this.b = b;
        this.result = result;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Integer getA() {
        return a;
    }
    public void setA(Integer a) {
        this.a = a;
    }
    public Integer getB() {
        return b;
    }
    public void setB(Integer b) {
        this.b = b;
    }
    public Integer getResult() {
        return result;
    }
    public void setResult(Integer result) {
        this.result = result;
    }
}



