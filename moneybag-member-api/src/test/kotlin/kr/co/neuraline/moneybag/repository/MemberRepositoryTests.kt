package kr.co.neuraline.moneybag.repository

import kr.co.neuraline.moneybag.core.enum.Gender
import kr.co.neuraline.moneybag.entity.Member
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class MemberRepositoryTests @Autowired constructor(
    val memberRepository: MemberRepository
) {
    @Test
    fun save_member_test() {
        val newMember = Member(
            memberPhone = "01075888862",
            memberName = "홍길동",
            memberGender = Gender.MAN
        )

        val resultMember = memberRepository.save(newMember)

        assertThat(resultMember.memberPhone).isEqualTo(newMember.memberPhone)
        assertThat(resultMember.memberName).isEqualTo(newMember.memberName)
        assertThat(resultMember.memberGender).isEqualTo(newMember.memberGender)
    }
}