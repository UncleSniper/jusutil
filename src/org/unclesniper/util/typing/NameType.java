package org.unclesniper.util.typing;

import java.util.List;

public interface NameType extends GenericTypeName {

	InstantiableNameType getSuperclassName();

	List<InstantiableNameType> getImplementedInterfaceNames();

	List<NameTypeMember> getMemberTypeNamed();

}
