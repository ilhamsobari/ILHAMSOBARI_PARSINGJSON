package id.ac.pelitabangsa.ilhamsobari_parsingjson.model
import com.google.gson.annotations.SerializedName

data class responuser(
        @field:SerializedName("page")
        val page: Int? = null,

        @field:SerializedName("per_page")
        val per_page: Int? = null,

        @field:SerializedName("Total_page")
        val Total_page: Int? =null,

        @field:SerializedName("Data")
        val Data: List<dataitem>?= null
)
