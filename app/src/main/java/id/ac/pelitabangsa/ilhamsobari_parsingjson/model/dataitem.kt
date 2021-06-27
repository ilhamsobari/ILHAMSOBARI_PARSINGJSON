package id.ac.pelitabangsa.ilhamsobari_parsingjson.model

import com.google.gson.annotations.SerializedName

data class dataitem(
        @field:SerializedName("id")
        val id: Int? = null,

        @field:SerializedName("email")
        val email: String? = null,

        @field:SerializedName("first_name")
        val firstname: String? = null,

        @field:SerializedName("Last_Name")
        val LastName: String? = null,

        @field:SerializedName("Avatar")
        val Avatar: String? = null
)
