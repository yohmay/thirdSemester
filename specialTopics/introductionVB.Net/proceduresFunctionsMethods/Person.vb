Public Class Person
    Private document As String
    Private name As String

    Property pdocument() As String
        Get
            Return document
        End Get
        Set(ByVal value As String)
            Me.document = value
        End Set
    End Property
        
    Property pname() As String
        Get
            Return name
        End Get
        Set(ByVal value As String)
            Me.name = value
        End Set
    End Property
End Class
