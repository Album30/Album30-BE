package com.mate.album30.domain.orderMatch.entity;

import com.mate.album30.domain.albumTalk.entity.ChatRoom;
import com.mate.album30.domain.common.BaseEntity;
import com.mate.album30.domain.member.entity.Member;
import jakarta.persistence.*;
import lombok.*;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "matching")
public class Match extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long matchId;

    @OneToOne
    private Order buyer;

    @OneToOne
    private Order seller;

    @OneToOne
    private ChatRoom chatRoom;

//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "member_id", nullable = false, unique = true)
//    private Member member;

}
