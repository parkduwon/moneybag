package kr.co.neuraline.moneybag.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import kr.co.neuraline.moneybag.core.enum.Gender
import org.jetbrains.annotations.NotNull

@Entity
data class Member(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val memberId: Long? = null,

    @NotNull
    @Column(name = "member_name")
    val memberName: String,

    @NotNull
    @Column(name = "member_phone")
    val memberPhone: String,

    @NotNull
    @Column(name = "member_gender")
    val memberGender: Gender,

    ) : AuditEntity()