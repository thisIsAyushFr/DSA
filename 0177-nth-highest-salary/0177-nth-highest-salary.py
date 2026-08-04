import pandas as pd

def nth_highest_salary(employee: pd.DataFrame, N: int) -> pd.DataFrame:
    x = employee['salary'].sort_values(ascending=False).drop_duplicates()
    if N > len(x) or N<=0:
        return pd.DataFrame({f'getNthHighestSalary({N})':[None]})
    y = x.iloc[N-1]
    return pd.DataFrame({f'getNthHighestSalary({N})':[y]})