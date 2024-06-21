import axios from "axios";

const API_URL = "http://localhost:8080";

export const addToDB = async (payload) => {
	try {
		return await axios.post(`${API_URL}/add`, payload);
	} catch (error) {
		console.log("Error: " + error.message);
		return error.response.data;
	}
};
