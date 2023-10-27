Public Class Person
    Private documents As String
    Private name As String

    Property pname() As String
        Get
            Return name
        End Get
        Set(ByVal value As String)
            Me.name = value
        End Set
    End Property
End Class
