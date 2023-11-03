using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Employee
{
    class Employee
    {
        private string EmployeeName;
        private int EmployeeAge;

        public int Age
        {
            get { return EmployeeAge; }
            set { EmployeeAge = value; }
        }

        public string Name
        {
            get { return EmployeeName; }
            set { EmployeeName = value; }
        }
    }
}
