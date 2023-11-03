Imports System.Windows.Forms

Namespace specialTopics.objectsAndEvents
    Public Partial Class Example
        Inherits Form
        Public Sub New()
            InitializeComponent()
        End Sub

        Private Sub FormMouseMove(sender As Object, e As MouseEventArgs)
            textBoxX.Text = MousePosition.X.ToString()
            textBoxY.Text = MousePosition.Y.ToString()
        End Sub
    End Class
End Namespace
