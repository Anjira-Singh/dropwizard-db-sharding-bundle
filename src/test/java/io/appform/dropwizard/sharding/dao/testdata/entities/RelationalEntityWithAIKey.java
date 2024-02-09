package io.appform.dropwizard.sharding.dao.testdata.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "relations")
public class RelationalEntityWithAIKey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "key", nullable = false)
    private String key;

    private String value;

    @Builder
    public RelationalEntityWithAIKey(String key, String value) {
        this.key = key;
        this.value = value;
    }
}
