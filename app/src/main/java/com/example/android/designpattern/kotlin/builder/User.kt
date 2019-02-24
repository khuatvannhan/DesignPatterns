package com.example.android.designpattern.kotlin.builder

import java.util.*

class User(var builder: Builder) {
    class Builder {
        var id: Int = 0
        lateinit var name: String
        lateinit var email: String
        lateinit var birthday: Date
        var weight: Int = 0
        var height: Int = 0
        var groupId: Int = 0
        var companyId: Int = 0

        fun setId(id: Int): Builder {
            this.id = id
            return this
        }

        fun setName(name: String): Builder {
            this.name = name
            return this
        }

        fun setEmail(email: String): Builder {
            this.email = email
            return this
        }

        fun setBirthday(birthday: Date): Builder {
            this.birthday = birthday
            return this
        }

        fun setWeight(weight: Int): Builder {
            this.weight = weight
            return this
        }

        fun setHeight(height: Int): Builder {
            this.height = height
            return this
        }

        fun setGroupId(groupId: Int): Builder {
            this.groupId = groupId
            return this
        }

        fun setCompanyId(companyId: Int): Builder {
            this.companyId = companyId
            return this
        }

        fun builder(): User {
            validate()
            return User(this)
        }

        fun validate() {

        }
    }
}
