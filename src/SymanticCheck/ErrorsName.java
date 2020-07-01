package SymanticCheck;

public class ErrorsName {

    public  static String UsingUndeclaredVariable="using undeclared variable";

    public  static String UsingUnExistedColumnOfTypeORTable="using un-existed column of a type/table";

    public  static String MultipleDeclarationsVariable="Multiple Declarations: a variable should be declared (in the same scope) at most onc";

    public  static String AssigningAnotherTypeForDeclaredVariable="assigning another type for declared variable";

    public  static String SelectUndefinedColumnFromTypeOrTable="select undefined column from type/table";

    public  static String DuplicateColumnNameInSameTableOrType="duplicate column name in same table/type";

    public  static String UsingUnassignedVariable="using unassigned variable";

    public  static String UsingOfUndeclaredType ="using of undeclared type (like table)";

    public  static String CallingUndeclaredMethod ="calling undeclared method";

    public  static String HavingClauseContainsOnlyGroupingFunctions ="Having clause contains only grouping functions";

    public  static String GroupByClauseCanNotContainAggregateFunction ="Group by clause can’t contain aggregate function";

    public  static String JoinDoesNotHaveONStatementWithIt ="join doesn’t have ON statement with it";

    public  static String INClauseIfReturnMoreThanOneColumn ="IN Clause if  return more than one column";

}
