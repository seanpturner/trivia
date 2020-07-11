package Trivia.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import javax.validation.constraints.NotBlank;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer item_id;
    @NotBlank
    private String item_title;
    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy")
    private Date item_date;
    private String item_notes;
    private Boolean item_active;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy")
    private Date r1_date;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy")
    private Date r2_date;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy")
    private Date r3_date;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy")
    private Date r4_date;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy")
    private Date r5_date;
    private Boolean review1;
    private Boolean review2;
    private Boolean review3;
    private Boolean review4;
    private Boolean review5;

    public Item() {
    }

    public Item(
            Integer item_id,
            @NotBlank String item_title,
            @NotNull Date item_date,
            String item_notes,
            Boolean item_active,
            Date r1_date,
            Date r2_date,
            Date r3_date,
            Date r4_date,
            Date r5_date,
            Boolean review1,
            Boolean review2,
            Boolean review3,
            Boolean review4,
            Boolean review5) {
        this.item_id = item_id;
        this.item_title = item_title;
        this.item_date = item_date;
        this.item_notes = item_notes;
        this.item_active = item_active;
        this.r1_date = r1_date;
        this.r2_date = r2_date;
        this.r3_date = r3_date;
        this.r4_date = r4_date;
        this.r5_date = r5_date;
        this.review1 = review1;
        this.review2 = review2;
        this.review3 = review3;
        this.review4 = review4;
        this.review5 = review5;
    }

    public Integer getItem_id() {
        return item_id;
    }

    public void setItem_id(Integer item_id) {
        this.item_id = item_id;
    }

    public String getItem_title() {
        return item_title;
    }

    public void setItem_title(String item_title) {
        this.item_title = item_title;
    }

    public Date getItem_date() {
        return item_date;
    }

    public void setItem_date(Date item_date) {
        this.item_date = item_date;
    }

    public String getItem_notes() {
        return item_notes;
    }

    public void setItem_notes(String item_notes) {
        this.item_notes = item_notes;
    }

    public Boolean getItem_active() {
        return item_active;
    }

    public void setItem_active(Boolean item_active) {
        this.item_active = item_active;
    }

    public Date getR1_date() {
        return r1_date;
    }

    public void setR1_date(Date r1_date) {
        this.r1_date = r1_date;
    }

    public Date getR2_date() {
        return r2_date;
    }

    public void setR2_date(Date r2_date) {
        this.r2_date = r2_date;
    }

    public Date getR3_date() {
        return r3_date;
    }

    public void setR3_date(Date r3_date) {
        this.r3_date = r3_date;
    }

    public Date getR4_date() {
        return r4_date;
    }

    public void setR4_date(Date r4_date) {
        this.r4_date = r4_date;
    }

    public Date getR5_date() {
        return r5_date;
    }

    public void setR5_date(Date r5_date) {
        this.r5_date = r5_date;
    }

    public Boolean getReview1() {
        return review1;
    }

    public void setReview1(Boolean review1) {
        this.review1 = review1;
    }

    public Boolean getReview2() {
        return review2;
    }

    public void setReview2(Boolean review2) {
        this.review2 = review2;
    }

    public Boolean getReview3() {
        return review3;
    }

    public void setReview3(Boolean review3) {
        this.review3 = review3;
    }

    public Boolean getReview4() {
        return review4;
    }

    public void setReview4(Boolean review4) {
        this.review4 = review4;
    }

    public Boolean getReview5() {
        return review5;
    }

    public void setReview5(Boolean review5) {
        this.review5 = review5;
    }
}