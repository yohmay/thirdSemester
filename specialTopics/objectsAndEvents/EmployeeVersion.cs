using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Employee
{
    public partial class Form : Form
    {
        private Employee E;
        public Form()
        {
            InitializeComponent()
            E = new Employee()
        }
    }
}