package kr.co.neuraline.moneybag.repository

import kr.co.neuraline.moneybag.entity.Member
import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository : JpaRepository<Member, Long>