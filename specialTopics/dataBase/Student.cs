using System;
using System.Data.SqlClient;

namespace WebApplication
{
    public class StudentDAO
    {
        SqlConnection connection = new SqlConnection(@"Data Source=(LocalDB)\v11.0;AttachDbFilename=|DataDirectory|\database.mdf;Integrated Security=True");
        SqlCommand cmd;
        SqlDataReader dr;

        public StudentDAO()
        {
            try
            {
                connection.Open();
            }
            catch (Exception ex)
            {
                throw ex;
            }
        }

        public string SaveStudent(Student student)
        {
            string response = "";
            string sql = "";
            int rowsAffected;

            try
            {
                sql = "INSERT INTO Student(rgm, name, oneTest, twoTest) VALUES ('" + student.RGM + "','" + student.Name + "','" + student.OneTest + "','" + student.TwoTest + "')";
                cmd = new SqlCommand(sql, connection);
                rowsAffected = cmd.ExecuteNonQuery();

                if (rowsAffected > 0)
                {
                    response = "OK";
                }
                else
                {
                    response = "Failed to insert record: " + sql;
                }
            }
            catch (Exception ex)
            {
                response = "Error: " + ex.Message;
            }

            return response;
        }
    }
}
