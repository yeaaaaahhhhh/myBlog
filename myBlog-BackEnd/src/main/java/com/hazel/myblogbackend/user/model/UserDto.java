package com.hazel.myblogbackend.user.model;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
@Schema(name = "UesrDto : 회원정보",description = "회원 기본정보")
public class UserDto {
    @Schema
    @NonNull
    private String id;
    @Schema
    private String password;
}
