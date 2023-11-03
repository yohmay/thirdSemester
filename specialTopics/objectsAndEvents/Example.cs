using System;
using System.Windows.Forms;

namespace SpecialTopics.ObjectsAndEvents
{
    public partial class Example : Form
    {
        public Example()
        {
            InitializeComponent();
        }

        private void FormMouseMove(object sender, MouseEventArgs e)
        {
            textBoxX.Text = MousePosition.X.ToString();
            textBoxY.Text = MousePosition.Y.ToString();
        }
    }
}
