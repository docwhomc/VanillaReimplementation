
package net.minestom.vanilla.generation.biome.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ambient {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("weight")
    @Expose
    private int weight;
    @SerializedName("minCount")
    @Expose
    private int minCount;
    @SerializedName("maxCount")
    @Expose
    private int maxCount;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Ambient() {
    }

    /**
     * 
     * @param weight
     * @param minCount
     * @param type
     * @param maxCount
     */
    public Ambient(String type, int weight, int minCount, int maxCount) {
        super();
        this.type = type;
        this.weight = weight;
        this.minCount = minCount;
        this.maxCount = maxCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Ambient withType(String type) {
        this.type = type;
        return this;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Ambient withWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public int getMinCount() {
        return minCount;
    }

    public void setMinCount(int minCount) {
        this.minCount = minCount;
    }

    public Ambient withMinCount(int minCount) {
        this.minCount = minCount;
        return this;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(int maxCount) {
        this.maxCount = maxCount;
    }

    public Ambient withMaxCount(int maxCount) {
        this.maxCount = maxCount;
        return this;
    }

}
