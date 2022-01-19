package org.unclesniper.util.typing;

public interface Member {

	String getMemberName();

	boolean isStaticMember();

	MemberKind getMemberKind();

	DetailedMemberKind getDetailedMemberKind();

	NameTypeMember asNameTypeMember();

	TypeMember asTypeMember();

	NameFieldMember asNameFieldMember();

	FieldMember asFieldMember();

	NameMethodMember asNameMethodMember();

	MethodMember asMethodMember();

}
