/*Store = 1
Μόνο το κατάστημα 1

Dept 1-20
Τμήματα 1 έως 20

Year 2012
Μόνο το έτος 2012

No Holidays
Εξαίρεση εβδομάδων αργιών
*/
select * from walmart_sales where Store=1 and Dept between 1 and 20;
select * from walmart_sales where year(Date) = 2012;
select * from walmart_sales where IsHoliday = 0;

/*alltogether*/
select * from walmart_sales where Store=1 and Dept between 1 and 20 and  year(Date) = 2012 and IsHoliday = 0;