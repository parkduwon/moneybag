package kr.co.neuraline.moneybag.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.jetbrains.annotations.NotNull

@Entity
data class Member(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val memberId: Long = 1,

    @NotNull
    @Column(name = "member_name")
    val memberName: String,

    @NotNull
    @Column(name = "member_phone")
    val memberPhone: Int,

    ) : AuditEntity()