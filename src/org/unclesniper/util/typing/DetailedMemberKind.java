package org.unclesniper.util.typing;

public enum DetailedMemberKind {

	TYPE(MemberKind.TYPE, false),
	TYPE_NAME(MemberKind.TYPE, true),
	FIELD(MemberKind.FIELD, false),
	FIELD_NAME(MemberKind.FIELD, true),
	METHOD(MemberKind.METHOD, false),
	METHOD_NAME(MemberKind.METHOD, true);

	public final MemberKind kind;

	public final boolean nameOnly;

	private DetailedMemberKind(MemberKind kind, boolean nameOnly) {
		this.kind = kind;
		this.nameOnly = nameOnly;
	}

}
